import { Navigate, useNavigate } from "react-router-dom";

function Dashboard(){

    const navigate = useNavigate();
    const userDetails = JSON.parse(localStorage.getItem("user-details"));
    const username = userDetails?.username;
    function logout(){
        const markLogout = JSON.stringify({...userDetails, authenticated: false});
        localStorage.setItem("user-details", markLogout);
        navigate("/login");
    }


    return (
        <>
                <div>
                    <h2>Welcome !! {username}</h2>
                    <div>
                        <button onClick={(e)=>{
                            e.preventDefault();
                            navigate("/counter");
                        }}>Counter</button>
                    </div>
        
                    <div>
                        <button onClick={(e)=>{
                            e.preventDefault();
                            navigate("/digital-clock");
                        }}>Digital Cock</button>
                    </div>
        
                    <button onClick={logout}>Logout</button>
                </div>

        </>
    )
}

export default Dashboard;