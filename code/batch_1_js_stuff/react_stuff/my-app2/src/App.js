
import './App.css';
import EmpFooterComponent from './components/EmpFooterComponent';
import EmpHeaderComponent from './components/EmpHeaderComponent';
import EmpList from './components/EmpList';

function App() {
  return (
    <div className="App">
      <EmpHeaderComponent/>
      <div className='container'>
           <EmpList/>
      </div>
      <EmpFooterComponent/>
    </div>
  );
}

export default App;
