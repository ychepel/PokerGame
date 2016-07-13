pokerApp.component('showUsers', {
    templateUrl: 'fragments/users.html',
    controller: function(showUsersService) {
        const vm = this;

        showUsersService.getUsers().then(function(data) {
            vm.users = data;
        });
    }
});