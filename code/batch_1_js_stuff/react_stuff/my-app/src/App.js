import './App.css';
import Hello from './components/Hello';
import Welcome from './components/Welcome';
import Welcome2 from './components/Welcome2';

function App() {
  return (
    <div className="App">
      <h2>hello to react js !!</h2>
      <Welcome /> <br/>
      <Welcome2 name="raj" city="delhi"/> <br/>
      <Welcome2 name="geeta" city="banglore"/> <br/>
      <Hello motive="master react"/>
    </div>
  );
}

export default App;
