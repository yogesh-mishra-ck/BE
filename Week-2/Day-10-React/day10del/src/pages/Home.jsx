import React, { useEffect } from 'react'
import { Link, useNavigate } from 'react-router-dom'

function Home() {

const navigate = useNavigate();
  function handleLogin(e){
    e.preventDefault();
    const token = { isAuthenticated: true };
    localStorage.setItem("token", JSON.stringify(token));
    navigate("/dashboard")
  }

  useEffect(()=>{
      const storedToken = localStorage.getItem("token");
      if(storedToken){
        const token = JSON.parse(storedToken);
        if(token.isAuthenticated)
            navigate("/dashboard")
      }
    },[])
  return (
    <div>                 
        <button onClick={handleLogin}>
            Login
        </button>
    </div>
  )
}

export default Home