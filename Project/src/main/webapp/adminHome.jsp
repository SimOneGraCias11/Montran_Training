<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Dashboard</title>
    <style>
        body, html {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
        }
        .container {
            padding-top: 80px; 
            padding: 20px;
            flex: 1;
        }
        .charts {
            display: flex;
            justify-content: space-around;
            margin-bottom: 30px;
        }
        .chart-container {
            width: 45%;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
        }
        .table-container {
            background-color: #fff;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            margin-bottom: 30px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }
        table, th, td {
            border: 1px solid #ddd;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
    </style>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
</head>
<body>

    <%@ include file="header.jsp" %>

    <div class="container">
        <div class="charts">
            <div class="chart-container">
                <h3>Stock In/Out Overview</h3>
                <canvas id="stockChart"></canvas> 
            </div>
            
        </div>

       
        <div class="table-container">
            <h3>Recently Added Products</h3>
            <table>
                <thead>
                    <tr>
                        <th>Product ID</th>
                        <th>Product Name</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Manufacture Date</th>
                        <th>Expiry Date</th>
                     
                        
                    </tr>
                </thead>
                <tbody>
                   
                </tbody>
            </table>
        </div>

        
        <div class="table-container">
            <h3>Products Nearing Expiry</h3>
            <table>
                <thead>
                    <tr>
                        <th>Product ID</th>
                        <th>Product Name</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Manufacture Date</th>
                        <th>Expiry Date</th>
                    </tr>
                </thead>
                <tbody>
                </tbody>
            </table>
        </div>
    </div>

    <%@ include file="footer.jsp" %>

    <script>
        var ctx = document.getElementById('stockChart').getContext('2d');
        var stockChart = new Chart(ctx, {
            type: 'bar',
            data: {
                labels: ["a","b","c"], 
                datasets: [{
                    label: 'Stock Quantity',
                    data: [100,200,300], 
                    backgroundColor: ['#4CAF50', '#f44336'],
                    borderColor: ['#388E3C', '#d32f2f'],
                    borderWidth: 1
                }]
            },
            options: {
                scales: {
                    y: {
                        beginAtZero: true
                    }
                }
            }
        });

       
    </script>

</body>
</html>