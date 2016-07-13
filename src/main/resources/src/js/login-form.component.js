pokerApp.component('loginForm', {
    templateUrl: 'fragments/login.html',
    controller: function (userService) {
        this.logIn = function(user) {
            userService.logIn(user);
        };
    }
});