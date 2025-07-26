import React from "react"
import Post from "./Post"

export class Posts extends React.Component {
     constructor(props) {
          super(props)
          this.state = {
               posts: []
          }
     }

     loadPosts() {
          fetch("https://jsonplaceholder.typicode.com/posts").then(res => res.json())
               .then(data =>
                    this.setState({
                         posts:
                              [...this.state.posts,
                                   ...data.map(d => new Post(d.id, d.title, d.body))
                              ],

                    }))
     }

     componentDidMount() {
          this.loadPosts()
     }

     render() {
          return <div>
               {this.state.posts.map(post => (
                    <div key={post.id}>
                         <h2>{post.title}</h2>
                         <p>{post.body}</p>
                    </div>
               ))}
          </div>
     }
}