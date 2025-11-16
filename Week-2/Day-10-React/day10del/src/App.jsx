import './App.css'
import { BrowserRouter,Routes,Route,Link } from "react-router-dom"
import Home from './pages/Home'
import Error404 from './pages/Error404'
import Dashboard from "./pages/Dashboard"
import Counter from './components/Counter'
import Clock from './components/Clock'
import Choose from './components/Choose'
import ProtectedRoutes from './components/ProtectedRoutes'

function App() {


  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<Home />}>Home</Route>
          <Route path='/login' element={<Home />}>Home</Route>

          <Route element={<ProtectedRoutes/>}>
            <Route path='/dashboard' element={<Dashboard/>} >
                <Route index element={<Choose/>} />
                <Route path='counter' element={<Counter/>}>Counter</Route>
                <Route path='clock' element={<Clock/>}>Clock</Route>
            </Route>
          </Route>
          <Route path='*' element={<Error404/>}>Not Found</Route>
        </Routes>
      </BrowserRouter>      
    </>
  )
}

export default App
