import React from "react";
import "./App.css";

function App() {
  const offices = [
    {
      name: "DBS",
      rent: 50000,
      address: "Chennai",
      image:
        "https://img.freepik.com/free-photo/modern-office-space-interior_158595-5206.jpg",
    },
    {
      name: "Regus",
      rent: 70000,
      address: "Bangalore",
      image:
        "https://t4.ftcdn.net/jpg/03/84/55/29/360_F_384552930_zPoe9zgmCF7qgt8fqSedcyJ6C6Ye3dFs.jpg",
    },
  ];

  return (
    <div style={{ padding: "20px" }}>
      <h1>Office Space, at Affordable Range</h1>
      {offices.map((office, index) => (
        <div key={index} style={{ marginBottom: "30px" }}>
          <img
            src={office.image}
            alt={office.name}
            style={{ width: "200px", height: "150px", objectFit: "cover" }}
          />
          <h2>Name: {office.name}</h2>
          <p
            style={{
              color: office.rent < 60000 ? "red" : "green",
              fontWeight: "bold",
            }}
          >
            Rent: Rs. {office.rent}
          </p>
          <p>
            <strong>Address:</strong> {office.address}
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;
