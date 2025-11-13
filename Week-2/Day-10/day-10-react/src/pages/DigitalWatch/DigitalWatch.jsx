import { useEffect, useState } from "react";

function DigitalWatch(){

    const [time,setTime] = useState({
        hours: "",
        minutes: "",
        seconds: ""
    })
    useEffect(()=>{
        
        const interval = setInterval(()=>{
            const date = new Date();
            setTime({hours: date.getHours(), minutes: date.getMinutes(), seconds: date.getSeconds()});
        }, 1000);

        return ()=> clearInterval(interval);
    },[])

    const properTime = (currentVal) => currentVal<10 ? "0"+currentVal : currentVal;

    return (
        <>
            <div>
                <h2>Current Time</h2>
                <div>
                    <p>{ properTime(time.hours.toString())} : </p>
                    <p>{ properTime(time.minutes.toString()) } : </p>
                    <p>{ properTime(time.seconds.toString()) }</p>
                </div>
            </div>
            
        </>
    )
}

export default DigitalWatch;