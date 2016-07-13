pokerApp.component('pageHeader', {
    templateUrl: 'fragments/header.html',
    controller: function(usernameService) {
        const vm = this;

        function showLoginLogout(value1, value2) {
            vm.showlogin = value1;
            vm.showlogout = value2;
        }

        if(usernameService.getName()) {
            showLoginLogout(false, true);
        } else {
            showLoginLogout(true, false);
        }

        this.logout = function() {
            showLoginLogout(true, false);
            usernameService.logOut();
        };
    }
});