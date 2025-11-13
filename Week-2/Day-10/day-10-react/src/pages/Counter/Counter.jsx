import { useState } from "react";

function Counter(){
    const [count,setCount] = useState(0);

    function decrement(){
        setCount(count-1);
    }
    
    function increment(){
        setCount(count+1);
    }

    return (
        <>
            <div>
                <button onClick={decrement}>Decrement</button>
                <p>{count}</p>
                <button onClick={ increment}>Increment</button>
            </div>
        </>
    )

}

export default Counter;