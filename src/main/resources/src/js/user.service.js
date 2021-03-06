pokerApp.factory('userService', function () {

    let username;
    let users;

    return {
        getName, logOut, register, getUsers, logIn
    };

    function getName() {
        return username;
    }

    function logOut() {
        username = '';
    }

    function logIn(user) {
        username = user.name;
    }

    function register(user) {
        users.push(user);
    }

    function createFakeUsers() {
        users = [
            {name: 'Ivan Petrov', email: 'a@a.a', password: 'pasw1'},
            {name: 'Sergey Kozlov', email: 'b@a.a', password: 'pasw2'},
            {name: 'Olha Pupkina', email: 'c@c.a', password: 'pasw3'}];
    }

    function getUsers() {
        if (!users) {
            createFakeUsers();
        }
        return users;
    }
});