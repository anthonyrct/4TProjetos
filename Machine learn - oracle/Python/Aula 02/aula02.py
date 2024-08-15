import tensorflow as tf
from tensorflow.keras import layers, models
from tensorflow.keras.preprocessing.text import Tokenizer
from tensorflow.keras.preprocessing.sequence import pad_sequences

# Carregar o conjunto de dados IMDB
imdb = tf.keras.datasets.imdb
(train_data, train_labels), (test_data, test_labels) = imdb.load_data(num_words=10000)

# Limitar o número de palavras mais frequentes para 10.000
vocab_size = 10000
max_length = 250  # Limitar o comprimento de cada sequência de texto
padding_type = "post"

# Padronizar o comprimento das sequências de treino e teste
train_data = pad_sequences(train_data, maxlen=max_length, padding=padding_type)
test_data = pad_sequences(test_data, maxlen=max_length, padding=padding_type)

model = models.Sequential(
    [
        layers.Embedding(vocab_size, 64, input_length=max_length),
        layers.LSTM(64, return_sequences=True),
        layers.LSTM(64),
        layers.Dense(64, activation="relu"),
        layers.Dense(1, activation="sigmoid"),  # Sigmoid para saída binária
    ]
)

# Compilar o modelo
model.compile(optimizer="adam", loss="binary_crossentropy", metrics=["accuracy"])

# Resumo do modelo
model.summary()

num_epochs = 5
history = model.fit(
    train_data,
    train_labels,
    epochs=num_epochs,
    validation_data=(test_data, test_labels),
    verbose=2,
)

# Avaliar no conjunto de teste
test_loss, test_acc = model.evaluate(test_data, test_labels)
print(f"Test accuracy: {test_acc}")

# Fazer previsões sobre novos dados
predictions = model.predict(test_data)

# Exemplo de como interpretar uma previsão
for i in range(5):
    print(f"Review: {test_data[i]}")
    print(f"Sentiment: {'Positive' if predictions[i] > 0.5 else 'Negative'}\n")
