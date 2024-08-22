<div class="mt-4">
    <label for="nome" class="block text-sm font-medium text-gray-700">Nome</label>
    <input id="nome" name="nome" type="text" required class="mt-1 block w-full border-gray-300 rounded-md shadow-sm focus:border-indigo-500 focus:ring-indigo-500 sm:text-sm" value="{{ old('nome') }}">
</div>

<div class="mt-4">
    <label for="email" class="block text-sm font-medium text-gray-700">Email</label>
    <input id="email" name="email" type="email" required class="mt-1 block w-full border-gray-300 rounded-md shadow-sm focus:border-indigo-500 focus:ring-indigo-500 sm:text-sm" value="{{ old('email') }}">
</div>

<div class="mt-4">
    <label for="password" class="block text-sm font-medium text-gray-700">Senha</label>
    <input id="password" name="password" type="password" required class="mt-1 block w-full border-gray-300 rounded-md shadow-sm focus:border-indigo-500 focus:ring-indigo-500 sm:text-sm">
</div>

<div class="mt-4">
    <label for="password_confirmation" class="block text-sm font-medium text-gray-700">Confirmar Senha</label>
    <input id="password_confirmation" name="password_confirmation" type="password" required class="mt-1 block w-full border-gray-300 rounded-md shadow-sm focus:border-indigo-500 focus:ring-indigo-500 sm:text-sm">
</div>

<div class="mt-4">
    <label for="role" class="block text-sm font-medium text-gray-700">Papel</label>
    <select id="role" name="role" required class="mt-1 block w-full border-gray-300 rounded-md shadow-sm focus:border-indigo-500 focus:ring-indigo-500 sm:text-sm">
        <option value="student">Aluno</option>
        <option value="teacher">Professor</option>
    </select>
</div>
