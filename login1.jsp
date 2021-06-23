
<html>
    <head>
        <meta charset="utf-8">
        <title>login form</title>
     

        <style>

body{
    margin: 0;
    padding: 0;
    font-family: sans-serif;
    background: url(login.jpg) no-repeat;
    background-size: cover;
    background-position: center;
}
.login-box{
    width: 320px;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%,-50%);
    color:#fff;
    height: 420px;
    background: #000;
    box-sizing: border-box;
    padding: 70px 30px;
}
.profile-icon-red-2{
    width: 100px;
    height: 100px;
    border-radius: 50%;
    position: absolute;
    top: -50px;
    left:calc(50% - 50px);

}
h1{
    margin: 0;
    padding: 0 0 20px;
    text-align: center;
    font-size: 22px;

}
.login-box p{
    margin: 0;
    padding: 0;
    font-weight: bold;
}
.login-box input{
    width:100%;
    margin-bottom: 20px;

}
.login-box input[type="text"],input[type="password"]
{
    border: none;
    border-bottom: 1px solid #fff;
    background: transparent;
    outline: none;
    height: 40px;
    color: #fff;
    font-size: 16px;

}
.login-box input[type="submit"]
{
    border: none;
    outline: none;
    height: 40px;
    background: #fb2525;
    color: #fff;
    font-size: 18px;
    border-radius: 20px;

}
.login-box input[type="submit"]:hover
{
    cursor: pointer;
    background: #ffc107;
    color: #000;

}
.login-box a{
    text-decoration: none;
    font-size: 12px;
    line-height: 20px;
    color: darkgrey;

}
.login-box a:hover{
    color: #119adf;
}
        </style>
     </head>
        <body>

            <div class="login-box">
                <img src="profile-icon-red-2.png" class="profile-icon-red-2">
                <h1>Login here</h1>
                <form method="POST" action="login.jsp">
                    <p>Username</p>
                    <input type="text" name="uname" placeholder="enter username">
                    <p>Password</p>
                    <input type="password" name="pass" placeholder="Enter password">
                    <input type="submit" name="" value="Login">
                    <a href="">Lost your password?</a><br>
                    <a href="">Dont have an accont?</a> 
                                </form>

           </div>

        </body>
        </head>
        </html>