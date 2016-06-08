pokerApp.factory('usernameService', function ($cookies) {

    return {
        getName
    };

    function getName() {
        if (!$cookies.get('username')) {
            return 'Guest';
        } else {
            return $cookies.get('username');
        }
    }
});