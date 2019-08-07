 //控制层 
app.controller('LsUserController' ,function($scope,$controller,lsuserService){
	
	$controller('baseController',{$scope:$scope});//继承

	$scope.search = function(){
		$scope.isShow=[];
		//根据，姓名工号查找
		lsuserService.search($scope.searchEntity).success(
			function(response){
				angular.forEach(response,function (v,k) {
					if(v.state == '已离职'){
						$scope.isShow.push(false)
					}else {
						$scope.isShow.push(true)
					}
				})

				$scope.list  = response;
			}
		);

	}

	
	//查询实体 
	$scope.findOne=function(id){				
		lsuserService.findOne(id).success(
			function(response){
				$scope.entity= response.data;
				$scope.wxcode= response.wxcode;

			}
		);				
	}

	$scope.updateByEmpid = function (empid) {
		if (confirm("确认解绑吗？") == true) {
			lsuserService.updateByEmpid(empid).success(function (res) {
				if(res.status == 0){
					alert("该用户未进行过绑定！")
				}
			})
		}

	}
	// //搜索
	// $scope.search=function(page,rows){
	// 	bindingWechatService.search(page,rows,$scope.searchEntity).success(
	// 		function(response){
	// 			$scope.list=response.rows;
	// 			$scope.paginationConf.totalItems=response.total;//更新总记录数
	// 		}
	// 	);
	// }

    
});	
