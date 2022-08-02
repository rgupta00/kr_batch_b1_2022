import './App.css';
import Lists from './components/Lists';
//import First from './components/First';
import Login from './components/Login';
//import Hello from './components/Hello';
//mport Welcome from './components/Welcome';
//import Welcome3 from './components/Welcome3';
//import Welcome4 from './components/Welcome4';
// import Welcome2 from './components/Welcome2';

function App() {
  return (
    <div className="App">
      <h2>hello to react js !!</h2>
      <Lists/>
      {/* <First/> */}
      <Login loginStatus={true} username="raj" password="raj123"/>
      {/* <Welcome /> <br/> */}
      {/* <Welcome3 name="ukg training"/> */}
      {/* <Welcome4/> */}
      {/* <Welcome2 name="raj" city="delhi"/> <br/>
      <Welcome2 name="geeta" city="banglore"/> <br/>
      <Hello motive="master react"/> */}
    </div>
  );
}

export default App;
