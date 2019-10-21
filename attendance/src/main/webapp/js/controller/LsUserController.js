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
					}else if(v.state == '离职未办手续'){
						$scope.isShow.push(false)
					}
					else {
						$scope.isShow.push(true)

					}
				})

				$scope.list  = response;
			}
		);

	}

	// $scope.wxCode="";
	//查询实体
	$scope.findOne=function(id){
		lsuserService.findOne(id).success(
			function(response){
				$scope.entity= response.data;
				$scope.wxcode= response.wxcode;
				// $scope.wxCode = response.wxcode;

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

	//记录当前需要修改的员工的工号
	$scope.curEmpId ="";
	$scope.noteEmpId = function(empid){
		$scope.curEmpId = empid;
		var cityObj = $("#citySel");
		cityObj.attr("value", "");
	}

	//更新员工的部门id
	$scope.updateDeptId = function () {
		var deptId = $("#deptId").val();

	    // alert($scope.curEmpId+" <>$$$$$$$$$$<> "+ deptId)
		lsuserService.updateDeptId($scope.curEmpId,deptId).success(function (res) {
			// alert(res.message);
			$scope.reloadList();//重新加载
		})
	}
//修改状态为离职未办手续
	$scope.updateEmp = function (empid) {
		var msg = "您真的确定要修改吗？\n\n请确认！"+empid;
		if (confirm(msg)==true){
			lsuserService.updateEmp(empid).success(function(res){
				// alert("修改成功");
				$scope.reloadList();//重新加载
			})
		}else{
			return;
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
