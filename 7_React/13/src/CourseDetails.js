export function CourseDetails() {
     const courses = [{
          name: "Angular", date: "4/5/2021"
     }, { name: "React", date: "6/3/2021" }]

     return <div>
          <h1>Course Details</h1>
          {courses.map(({ name, date }) => <div key={name}>
               <h2>{name}</h2>
               <h3>{date}</h3>
          </div>)}
     </div>
}