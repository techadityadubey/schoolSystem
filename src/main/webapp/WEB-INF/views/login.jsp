<!doctype html>
<html lang="en"><head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="/resources/img/favicon.ico">

    <title> Login</title>_

    <!-- Bootstrap core CSS -->
    <link href="/resources/css/bootstrap.css" rel="stylesheet">
	<!-- font-awesome -->
    <link href="/resources/css/font-awesome.min.css" rel="stylesheet">
    <!--slick-slider-->
    <link href="/resources/css/slick.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="/resources/css/login.css" rel="stylesheet">
    <!-- Google font -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:100,200,300,400,500,600,700,800,900|Roboto:100,300,400,500,700" rel="stylesheet">  
  </head>
  
<body>
	
	<div class="login_outer">
		<div class="login_container">
        	<div class="LeftSide_login">
            		
                <form name='f' class="form-login"  action="login" method='POST' id="formsubmit">
                    <div class="login_logo text-center d-block w-100">
                    	<img src="/resources/img/login_logo.png" alt="" >
                    </div>
                    <div class="project_name mb-4">
                        <h3 class="d-inline-block">SchoolSystem</h3>
                        <p>Please login to your account</p>
                    </div>
                    <!--Alert Box-->
                    <div class="alert alert-danger alert-dismissible d-none">
                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                    <i class="icon fa fa-ban"></i> <strong>Alert!</strong><br>
                    Mail could not be sent to <strong>email id</strong> as the above email id is/are not available.
                    </div>
                    <!--Alert Box-->
                    
                    <!--User ID / Email ID-->
                    
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                          <span class="input-group-text"><i class="fa fa-user-o"></i></span>
                        </div>
                        <input type="email" id="inputEmail" name="username" class="form-control" placeholder="User ID / Email ID" required>
                      </div>
                    <!--User ID / Email ID-->
                    
                    <!--Password-->
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                          <span class="input-group-text"><i class="fa fa-unlock-alt"></i></span>
                        </div>
                       <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
                      </div>
                    
                    <!--Password-->
                    
                    <div class="checkbox mb-4 w-100">
                    <div class="custom-control custom-checkbox d-inline">
                      <input type="checkbox" class="custom-control-input" id="remember-me">
                      <label class="custom-control-label" for="remember-me">Remember me</label>
                    </div>
                   
                    <a class="pull-right" href="#" data-toggle="modal" data-target="#ForgotPassword" data-backdrop="static"> Forgot Password?</a>
                    </div>
                    
                    <div class="mb-3 d-block w-100"><a href="#" class="submit_btn" onclick="submitform()">Sign In </a></div>
                     <div class="sign-up-text mb-4">Don't have an account? <a href="sing_up.html">Sign up !</a></div>
                    
                    
                  <div class="footer text-center">Copyright &copy; 2019 <a href="#">DigiScape</a> | All Rights Reserved.</div>
                </form>
			</div>
            
			<div class="login_bg">
            	<div class="help_info w-100 d-block">Thu , 19 Mar 2019 | 15:02:30 <a href="#" class="white-border-btn ml-2">Help</a></div>
            	<div class="login-slider-wrap">
                    <ul class="login-slider-item">
                      <li>
                        <h2><!--Helping Business with their --><span>Redefining Typesetting</span></h2>
                        <p>Intelligence Layout Automation System offers consistent high quality output.</p>
                      </li>

                      <li>
                        <h2><!--Your Partner for Software Product --><span>Robotic Automation &amp; QA</span></h2>
                        <p>Robotic Automation adds the intelligence to not only detect errors but also to correct them.</p>
                      </li>

                       <li>
                        <h2><!--Developing Innovative --><span>Flexible &amp; Configurable</span></h2>
                        <p>Integrate easily with your current workflow and requirements.</p>
                      </li>
                    </ul>
                  </div>
            </div>

			
		</div>
	</div>
	
<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> 
    <!--<script src="js/jquery-3.3.1.slim.min.js"></script>-->
	<script src="/resources/js/jquery-1.11.1.min.js"></script>  
    <!-- Include all compiled plugins (below), or include individual files as needed --> 
    <script src="/resources/js/popper.min.js"></script> 
    <script src="/resources/js/bootstrap.min.js"></script>
    
    <!--Login Slider JS starts here-->
    <script src="/resources/js/slick.js"></script>
    <script type="text/javascript">
      // Login Slider JS starts here 
      $('.login-slider-item').slick({
        dots: true,
        autoplay: true,
        fade: true,
        arrows: false,
        infinite: true,
        speed:800,
        slidesToShow: 1,
        adaptiveHeight: true
      });// Login Slider JS ends here

      function submitform() {
          $('#formsubmit').submit();

      }
    </script>

</body>
</html>