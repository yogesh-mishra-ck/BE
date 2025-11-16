import React from 'react'
import { Link, NavLink, Outlet } from 'react-router-dom'

function Dashboard() {
  return (
    <div>
        <nav >
            <NavLink to="counter">Counter</NavLink>
            <NavLink to="clock">Digital Clock</NavLink>        
        </nav>

        <Outlet/>
    </div>
  )
}

export default Dashboard