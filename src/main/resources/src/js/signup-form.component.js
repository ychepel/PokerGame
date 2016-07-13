pokerApp.component('signupForm', {
    templateUrl: 'fragments/signup.html',
    controller: function (userService) {
        this.registerUser = function(user) {
            userService.register(user);
        };
    }
});