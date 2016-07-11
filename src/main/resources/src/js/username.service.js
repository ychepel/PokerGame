pokerApp.factory('usernameService', function () {

    let username = 'John Smith';

    return {
        getName, logOut
    };

    function getName() {
        return username;
    }

    function logOut() {
        username = '';
    }
});