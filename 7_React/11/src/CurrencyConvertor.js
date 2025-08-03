import React, { useState } from "react";

function CurrencyConvertor() {
  const [amount, setAmount] = useState("");
  const [currency, setCurrency] = useState("euro");
  const [converted, setConverted] = useState(null);

  const handleSubmit = (e) => {
    e.preventDefault();
    let result = 0;
    const inrAmount = parseFloat(amount);

    if (isNaN(inrAmount)) {
      alert("Please enter a valid number.");
      return;
    }

    const euroRate = 90;

    if (currency.toLowerCase() === "euro") {
      result = (inrAmount / euroRate).toFixed(2);
      setConverted(`${result} Euros`);
    } else if (currency.toLowerCase() === "inr") {
      result = (inrAmount * euroRate).toFixed(2);
      setConverted(`${result} INR`);
    } else {
      alert("Please enter 'euro' or 'inr' as currency.");
    }
  };

  return (
    <div style={{ marginTop: "30px" }}>
      <h2 style={{ color: "green" }}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Amount: </label>
          <input
            type="text"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
        </div>
        <div>
          <label>Currency: </label>
          <input
            type="text"
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
          />
        </div>
        <button type="submit">Submit</button>
      </form>

      {converted && (
        <h3 style={{ marginTop: "15px", color: "blue" }}>
          Converted Amount: {converted}
        </h3>
      )}
    </div>
  );
}

export default CurrencyConvertor;
