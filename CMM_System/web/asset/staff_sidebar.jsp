<%-- 
    Document   : sidebar
    Created on : Dec 31, 2020, 6:24:50 PM
    Author     : User
--%>

<%@page import="bean.Program"%>
<%@page import="bean.Staff"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <% Staff ust1 = (Staff)session.getAttribute("ust1"); %>
        <% Program proIndex = (Program)session.getAttribute("proIndex"); %>
        <!-- Sidebar -->
            <ul class="navbar-nav bg-gradient-sidebar-staff sidebar sidebar-dark accordion" id="accordionSidebar">

                <li class="nav-item dropdown no-arrow">
                    <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"
                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <img class="img-profile rounded-circle" src="img/undraw_profile.svg">
                        <span class="sidebar-brand align-items-center justify-content-center sidebar-brand-text mx-3">
                            <%= ust1.getFullname() %></span><br>
                    </a>
                </li>

                
                <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages"
                    aria-expanded="true" aria-controls="collapsePages">
                    <i class="fas fa-power-off"></i>
                    <span>Account</span>
                </a>
                <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <a class="collapse-item" href="ProfileStaff">Edit Profile</a>
                        <a class="collapse-item" href="LogoutServlet">Logout</a>
                    </div>
                </div>
                </li>

                <!-- Divider -->
                <hr class="sidebar-divider my-0">

                <!-- Nav Item - Dashboard -->
                <li class="nav-item">
                    <a class="nav-link" href="staff_programIndex">
                        <i class="fa fa-home"></i>
                        <span>Dashboard</span></a>
                </li>

                <!-- Nav Item - Dashboard -->
                <li class="nav-item">
                    <a class="nav-link" href="staff_programServlet">
                        <i class="far fa-file"></i>
                        <span>Program</span></a>
                </li>

                <!-- Nav Item - Dashboard -->
                <li class="nav-item">
                    <a class="nav-link" href="staff_merit_SELECTrequestApprovalMerit">
                        <i class="fas fa-certificate"></i>
                        <span>Merit</span></a>
                </li>

                <!-- Nav Item - Dashboard -->
                <li class="nav-item">
                    <a class="nav-link" href="staff_programHistory">
                        <i class="fa fa-history"></i>
                        <span>History</span></a>
                </li>
            </ul>
            <!-- End of Sidebar -->
    </body>
</html>
