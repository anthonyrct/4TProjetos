'use client';


import { useState } from 'react';
import { useRouter } from 'next/navigation';


export default function Login() {
  const [username, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const router = useRouter();


  const handleLogin = async (e) => {
    e.preventDefault();
    const response = await fetch('/api/auth/login', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ email, password }),
    });


    const data = await response.json();
    if (response.ok) {
      localStorage.setItem('token', data.token);
      router.push('/tasks');
    } else {
      alert('Credenciais inválidas');
    }
  };


  return (
    <form onSubmit={handleLogin}>
      <input
        type="text"
        placeholder="Email do Usuário"
        value={email}
        onChange={(e) => setemail(e.target.value)}
      />
      <input
        type="password"
        placeholder="Senha"
        value={password}
        onChange={(e) => setPassword(e.target.value)}
      />
      <button type="submit">Login</button>
    </form>
  );
}
