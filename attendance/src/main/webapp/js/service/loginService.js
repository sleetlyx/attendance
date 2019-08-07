//服务层
app.service('loginService',function($http){

	this.submit = function(obj){
		// return $http.post('/attendance/login?username='+username+'&password='+password);
		return $http.post('/attendance/login',obj);
	}

	this.getLoginSession = function () {
		return $http.get('./loginController/getLoginSession.do');
	}

});
