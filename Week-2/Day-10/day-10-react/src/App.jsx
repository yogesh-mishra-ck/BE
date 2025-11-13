import { BrowserRouter,Routes,Route,Link } from 'react-router-dom'
import './App.css'
import Login from './pages/Login/Login'
import Dashboard from './pages/Dashboard/Dashboard'
import Counter from './pages/Counter/Counter'
import DigitalWatch from './pages/DigitalWatch/DigitalWatch'
import Home from './pages/Home/home'
import ProtectedRoute from './components/ProtectedRoute'

function App() {


  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<Home/>}></Route>
          <Route path='/login' element={ <Login/> } >Login</Route>

          <Route path='/dashboard' element={
            <ProtectedRoute>
              <Dashboard/>
            </ProtectedRoute>
            } />
          
          
          <Route path='/counter' element={
            <ProtectedRoute>
              <Counter/>
            </ProtectedRoute>
          } />

    

          <Route path='/digital-clock' element={
            <ProtectedRoute>
              <DigitalWatch/>
            </ProtectedRoute>
          } />

          <Route path='*'>404 Page</Route>
        </Routes>
      </BrowserRouter>
     
    </>
  )
}

export default App
