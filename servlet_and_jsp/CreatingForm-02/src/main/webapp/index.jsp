<html>
  <head>
    <title>Form Page</title>
    <style>
        .container{
            width: 30%;
            border: 1px solid black;
            margin: auto;
            padding: 20px;
            font-size: 20px;
        }
        #myForm table tr td input{
            font-size: 20px;
        }
        #myForm table tr {
             line-height: 30px;
        }

    </style>
  </head>
  <body>
    <div class="container">
      <h1>My Form</h1>

      <form id="myForm" action="RegisterServlet" method="post">
        <table>
          <tr>
            <td>Enter your name:</td>
            <td>
              <input type="text" name="user_name" placeholder="Your name" />
            </td>
          </tr>

          <tr>
            <td>Enter your password:</td>
            <td>
              <input
                type="password"
                name="user_password"
                placeholder="Enter password"
              />
            </td>
          </tr>

          <tr>
            <td>Enter your email</td>
            <td>
              <input type="email" name="user_email" placeholder="Your Email"
            </td>
          </tr>
          <tr>
            <td>Select Gender</td>
            <td>
              <input type="radio" name="user_gender" value="male" />Male &nbsp;
              &nbsp;
              <input type="radio" name="user_gender" value="female" />Female
            </td>
          </tr>
          <tr>
            <td>Select your course</td>
            <td>
              <select name="user_course">
                <option value="Java">Java</option>
                <option value="Php">Php</option>
                <option value="Python">Python</option>
                <option value="JavaScript">JavaScript</option>
              </select>
            </td>
          </tr>
          <tr>
            <td style="text-align: center" colspan="2">
              <input type="checkbox" value="checked" name="condition" /> &nbsp;
              &nbsp; Agree terms and condition
            </td>
          </tr>
          <tr>
            <td style="text-align:center" colspan=2>
              <button type="submit">Register</button> &nbsp; &nbsp; &nbsp;
              <button type="reset">Reset</button>
            </td>
          </tr>
        </table>
      </form>
    </div>
  </body>
</html>
