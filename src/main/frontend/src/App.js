import React from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import {
  Collapse,
  Navbar,
  NavbarToggler,
  NavbarBrand,
  Nav,
  NavItem } from 'reactstrap';
import Home from './components/Home'
import About from './components/About'
import Library from './components/Library';

class App extends React.Component {
  state = {
    isOpen: true,
  }

  toggle = () => {
    this.setState({
      isOpen: !this.state.isOpen
    });
  }

  render = () => {
    return (
      <Router>
          <div>
            <Navbar color="faded" light expand="md">
              <NavbarBrand href="/">BookStory Retaguarda</NavbarBrand>
              <NavbarToggler onClick={this.toggle} />
              <Collapse isOpen={this.state.isOpen} navbar>
                <Nav className="ml-auto" navbar>
                  <NavItem>
                    <Link className="nav-link" to="/">Home</Link>
                  </NavItem>
                  <NavItem>
                    <Link className="nav-link"  to="/about">About</Link >
                  </NavItem>
                  <NavItem>
                    <Link className="nav-link"  to="/library">Library</Link >
                  </NavItem>
                </Nav>
              </Collapse>
            </Navbar>


            <Route exact path="/" component={Home}/>
            <Route path="/about" component={About}/>
            <Route path="/library" component={Library}/>
        </div>
      </Router>
    )
  }

};

export default App;
