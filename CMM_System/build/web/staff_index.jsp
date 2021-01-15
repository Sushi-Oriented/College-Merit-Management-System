<%-- 
    Document   : staff_index
    Created on : Dec 31, 2020, 6:22:14 PM
    Author     : Alifah Ilyana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>College Merit Management System</title>

        <!-- Custom fonts for this template-->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

        <!-- Custom styles for this template-->
        <link href="css/sb-admin-2.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <!-- Page Wrapper -->
        <div id="wrapper">
            
            <%@include file="asset/staff_sidebar.jsp"%>

            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">

                    <%@include file="asset/topbar.jsp"%>

                    <!-- Begin Page Content -->
                    <div class="container-fluid">

                        <!-- Page Heading -->
                        <div class="d-sm-flex align-items-center justify-content-between mb-4">
                            <h1 class="h3 mb-0 text-gray-800">Welcome to College Merit Management System, <%= session.getAttribute("firstemail")%>!</h1>
                        </div>
                        <div class="card shadow mb-4">
                                <div class="card-header py-3">
                                    <h6 class="m-0 font-weight-bold text-maroon-primary">Basic Card Example</h6>
                                </div>
                                <div class="card-body">

                                    The styling for this basic card example is created by using default Bootstrap
                                    utility classes. By using utility classes, the style of the card component can be
                                    easily modified with no need for any custom CSS!
<<<<<<< Updated upstream:CMM_System/build/web/staff_index.jsp

=======
<<<<<<< HEAD
                                    
                                    HAPPY NEW YEARRRRRRR
=======
                                    Contoh ayat menipu:
                                    AMIRUL FAIZ HANDSOME JEEEE
>>>>>>> d557f4d8ae447104cfcad282a4a81f3a74c78b1e
>>>>>>> Stashed changes:CMM_System/web/index.jsp
                                </div>
                        </div>
                    </div>
                    <!-- /.container-fluid -->

                </div>
                <!-- End of Main Content -->

                <%@include file="asset/footer.jsp" %>

            </div>
            <!-- End of Content Wrapper -->

        </div>
        <!-- End of Page Wrapper -->
        
        <%@include file="asset/scrollTop.jsp"%>
        <%@include file="asset/bootstrapScript.jsp"%>
    </body>
</html>