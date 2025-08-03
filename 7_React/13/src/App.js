import './App.css';
import { CourseDetails } from './CourseDetails';
import { BookDetails } from './BookDetails';
import { BlogDetails } from './BlogDetails';

function Sep() {
  return <div style={{ backgroundColor: "green", width: "6px", height: "350px" }} />
}

function App() {
  return (
    <div className="App" style={{ display: "flex", gap: "20px", justifyContent: "center", alignItems: "center", height: "100vh" }}>
      <CourseDetails />
      <Sep />
      <BookDetails />
      <Sep />
      <BlogDetails />
    </div>
  );
}

export default App;
