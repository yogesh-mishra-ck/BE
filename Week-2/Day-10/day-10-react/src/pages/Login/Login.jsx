import { useState } from "react";
import { Navigate, useNavigate } from "react-router-dom";



function Login(){
    
    const [formData,setFormData] = useState({
        username: "",
        password: ""
    });

    const navigate = useNavigate();



    function handleSubmit(e){
        e.preventDefault();
        const userDetails = {
            username : formData.username,
            authenticated: true
        };
        localStorage.setItem("user-details", JSON.stringify(userDetails));
        navigate("/dashboard");
    }


    return (
        <>
            <form onSubmit={handleSubmit}>
                <div>
                    <label htmlFor="username">Username</label>
                    <input type="text" id="username" value={formData.username} onChange={(e)=>{
                        setFormData({...formData, username:e.target.value})
                    }}/>
                </div>

                <div>
                    <label htmlFor="password">Password</label>
                    <input type="password" id="password" value={formData.password} onChange={(e)=>{
                        setFormData({...formData, password: e.target.value})
                    }}/>
                </div>

                <button type="submit">Submit</button>
            </form>
        </>
    )
}

export default Login;