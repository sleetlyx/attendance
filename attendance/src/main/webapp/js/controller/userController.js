 //控制层 
app.controller('userController' ,function($scope,$controller   ,userService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
	//查询实体 
	$scope.findOne=function(id){				
		userService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	

	//保存
	$scope.save=function(){
		if($scope.issubmit){
			userService.add( $scope.entity ).success(
				function(response){
					if(response.success){
						//重新查询
						$scope.reloadList();//重新加载
					}else{
						alert(response.message);
					}
				}
			);
		}

	}
	// $scope.save=function(){
	// 	var serviceObject;//服务层对象
	// 	console.log($scope.entity.isUpdate+"%%%%%%%%%%%%%%%%%%")
	// 	if($scope.entity.isUpdate!=null){//如果有ID
	// 		serviceObject=userService.update( $scope.entity ); //修改
	// 	}else{
	// 		serviceObject=userService.add( $scope.entity  );//增加
	// 	}
	// 	serviceObject.success(
	// 		function(response){
	// 			if(response.success){
	// 				//重新查询
	// 	        	$scope.reloadList();//重新加载
	// 			}else{
	// 				alert(response.message);
	// 			}
	// 		}
	// 	);
	// }

//修改
	$scope.update=function(){
		userService.update( $scope.entity ).success(
			function(response){
				if(response.success){
					//重新查询
					$scope.reloadList();//重新加载
				}else{
					alert(response.message);
				}
			}
		);
	}

	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		userService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					$scope.reloadList();//刷新列表
					$scope.selectIds=[];
				}						
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象 
	
	//搜索
	$scope.search=function(page,rows){			
		userService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
    //校验工号是否存在
	$scope.issubmit = false;
	$scope.checkEmpId =  function () {
			userService.checkEmpId($scope.entity.userId).success(function (res) {
				if(res.flag){  //  为真值 该工号可用
					$scope.entity.userName = $scope.entity.userId
					$scope.essage=res.message;
					$scope.entity.phone = res.map.phone;
					$scope.entity.sex = res.map.sex;
					$scope.entity.name = res.map.name;
					$scope.issubmit = true;
				}else { //工号不可用
					$scope.essage=res.message;
					$scope.issubmit = false;
				}
			})

	}

	//在登录首页获取 登录的用户名称

	$scope.getUserName = function () {
		userService.getUserName().success(function (res) {
			$scope.currentUserName = res.userName;
			$scope.lastTime = res.lastTime;

			console.log(res,"$$$")
		})
	}
});	
