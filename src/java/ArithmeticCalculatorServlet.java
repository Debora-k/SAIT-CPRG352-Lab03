import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---" );
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String input1 = request.getParameter("number1");
        String input2 = request.getParameter("number2");
        
        request.setAttribute("input1", input1);
        request.setAttribute("input2", input2);
        
        try {
            int number1 = Integer.parseInt(input1);
            int number2 = Integer.parseInt(input2);
            
            String operation = request.getParameter("operation");
            int result = 0;
            
            if (operation.equals("+")) {
                result = number1 + number2;
            } else if (operation.equals("-")) {
                result = number1 - number2;
            } else if (operation.equals("*")) {
                result = number1 * number2;
            } else if (operation.equals("%")) {
                result = number1 % number2;
            } 
            String message = "" + result;
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            
        } catch (Exception e) {
            String message = "invalid";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }

        
        

           

    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
