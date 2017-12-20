import React from 'react'
import Book from './Book'
import axios from 'axios'
import { Table } from 'reactstrap'

class Libray extends React.Component {
  state = {
    books: []
  }

  componentDidMount() {
    var config = { headers: { 'Accept': 'application/json' },
                    auth: { username: 'user1', password: 'user1Pass' },
                    params: {}
                  };
    axios.get("/api/v1/book", config)
         .then(res => this.setState({ books: res.data }))
         .catch(function (error) {
           console.log(error);
         });
  };

  render = () => {
    return(
      <Table bordered>
        <thead>
          <tr>
            <th>Title</th>
            <th>ISBN</th>
            <th>Publisher</th>
            <th>Author(s)</th>
          </tr>
        </thead>
        <tbody>
        {this.state.books.length > 0  &&
          this.state.books.map((book, key) =>
          <Book key={key} item={book}/>
          )
        }
        </tbody>
      </Table>
    )
  }
}

export default Libray;
