pokerApp.component('showUsers', {
    templateUrl: 'fragments/users.html',
    controller: function(userService) {
        this.users = userService.getUsers();
    }
});