package controlador;

// SE CORRIGE LA IMPORTACIÓN: Ahora apunta a ClienteDAO
import DAO.ClienteDAO;
import Modelo.Cliente;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtClave;
    @FXML private Button btnIngresar;
    @FXML private Label lblError;

    // SE CORRIGE EL TIPO DE OBJETO: Ahora usamos ClienteDAO
    private final ClienteDAO clienteDAO = new ClienteDAO();

    @FXML
    private void handleLogin() {
        lblError.setText("");
        lblError.setStyle("-fx-text-fill: red;");

        String username = txtUsuario.getText().trim();
        String password = txtClave.getText().trim();

        // Validaciones locales (Campos vacíos)
        if (username.isEmpty()) {
            lblError.setText("Error: El campo 'Usuario' no puede estar vacío.");
            txtUsuario.requestFocus();
            return;
        }

        if (password.isEmpty()) {
            lblError.setText("Error: El campo 'Contraseña' no puede estar vacío.");
            txtClave.requestFocus();
            return;
        }

        // SE CORRIGE LA LLAMADA: Ahora invoca al método a través de clienteDAO
        Usuario usuarioLogueado = clienteDAO.validarUsuario(username, password);

        // Respuesta del sistema
        if (usuarioLogueado != null) {
            lblError.setStyle("-fx-text-fill: green;");
            lblError.setText("¡Bienvenido! Rol: " + usuarioLogueado.getRol());

            System.out.println("Acceso concedido.");
            System.out.println("Usuario: " + usuarioLogueado.getUsuario());
            System.out.println("Rol asignado desde BD: " + usuarioLogueado.getRol());

        } else {
            lblError.setText("Error: Usuario o contraseña incorrectos.");
        }
    }
}