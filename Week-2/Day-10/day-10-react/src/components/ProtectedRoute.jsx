import { Navigate } from "react-router-dom";

function ProtectedRoute( {children} ){
    
    const userDetails = JSON.parse(localStorage.getItem("user-details"));
    const authenticated = userDetails?.authenticated;

    if(!authenticated){
        return <Navigate to="/login"/>
    }

    return children
}

export default ProtectedRoute;