pokerApp.component('signupForm', {
    templateUrl: 'fragments/signup.html',
    controller: function (userService) {
        const vm = this;

        this.registerUser = function(user) {
            userService.register(user);
        };
    }
});