 //控制层 
app.controller('loginController' ,function($scope,$controller,loginService){
	
	$controller('baseController',{$scope:$scope});//继承

	$scope.submit = function () {

		loginService.submit($scope.obj).success(function(res){

			console.log(res,"@@@@@@");
		});
	}

	$scope.getLoginSession = function () {

		loginService.getLoginSession().success(function (res) {
			console.log(res.loginMesg+"#################")
			$scope.mesg = res.loginMesg;
		})
	}
    
});	
