const mongoose = require('mongoose');


const LivroSchema = new mongoose.Schema({
    titulo: {
        type: String,
        required: true
    },
    autor: {
        type: String,
        required: true
    },
    ano: {
        type: Number,
        required: true
    },
    genero: {
        type: String,
        required: false
    },
    avaliacoes:[
        {
            usuario: String,
            required: true,
            nota: Number,
            required: false,
            comentario: String,
            required: false
        }
    ]
});


module.exports = mongoose.model('Livro', LivroSchema);


