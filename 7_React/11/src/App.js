import React, { useState } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount((prev) => prev + 1);
  };

  const sayHello = () => {
    alert("Hello Member!");
  };

  const handleIncrement = () => {
    increment();
    sayHello();
  };

  const decrement = () => {
    setCount((prev) => prev - 1);
  };

  const sayWelcome = (message) => {
    alert(`Welcome, ${message}!`);
  };

  const handleClick = (e) => {
    alert("I was clicked");
  };

  return (
    <div style={{ padding: "20px" }}>
      <h1>React Event Examples App</h1>
      <h2>{count}</h2>
      <button onClick={handleIncrement}>Increment</button>{" "}
      <button onClick={decrement}>Decrement</button>{" "}
      <button onClick={() => sayWelcome("Member1")}>Say welcome</button>{" "}
      <button onClick={handleClick}>Click on me</button>
      <hr />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
