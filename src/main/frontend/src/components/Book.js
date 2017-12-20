import React from 'react';
import { Table } from 'reactstrap';

const Book = (props) => (
      <tr>
        <td>{props.item.title}</td>
        <td>{props.item.isbn}</td>
        <td>{props.item.publisher}</td>
        <td>{props.item.authors.map((name) => `${name.firstName} ${name.lastName}` )}</td>
      </tr>
    );

export default Book;
