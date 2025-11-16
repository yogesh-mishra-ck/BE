import React, { useEffect, useState } from 'react'

function Clock() {

    const [time, setTime] = useState({
        hours: new Date().getHours(),
        minutes: new Date().getMinutes(),
        seconds: new Date().getSeconds()
    });

    useEffect(()=>{
        const interval = setInterval(()=>{
            const currTime = new Date();
            setTime({
                hours: currTime.getHours(),
                minutes: currTime.getMinutes(),
                seconds: currTime.getSeconds()
            })
        },1000)

        return ()=> clearInterval(interval);
    },[])

  return (
    <div>
        <h2>Current Time</h2>
        <div className='time-container'>
            <h3>{time.hours}:</h3>
            <h3>{time.minutes}:</h3>
            <h3>{time.seconds}</h3>
        </div>
    </div>

  )
}

export default Clock