export function BookDetails() {
     const books = [
          { name: "Master React", price: 670 },
          { name: "Deep Dive Into Angular 11", price: 800 },
          { name: "Mongo Essentials", price: 450 }
     ]
     return <div>
          <h1>Book Details</h1>
          {books.map(({ name, price }) => <div key={name}>
               <h2>{name}</h2>
               <h3>{price}</h3>
          </div>)}
     </div>
}