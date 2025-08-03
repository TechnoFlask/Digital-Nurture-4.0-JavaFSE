export function BlogDetails() {
     const blogs = [
          { name: "React Learning", author: "Stephen Biz", content: "Welcome to learning React!" },
          { name: "Installation", author: "Schewzdenier", content: "You can install React from npm" }
     ]
     return <div>
          <h1>Blog Details</h1>
          {blogs.map(({ name, author, content }) => <div key={name}>
               <h2>{name}</h2>
               <h4>{author}</h4>
               <p>{content}</p>
          </div>)}
     </div>
}