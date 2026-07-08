package org.example.propuestaproyecto.Controlador;

import dao.ClienteDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import modelo.Cliente;

public class ClienteController {

    @FXML private TextField txtCedula;
    @FXML private TextField txtNombre;
    @FXML private TextField txtTelefono;
    @FXML private TextField txtCorreo;

    private final ClienteDAO clienteDAO = new ClienteDAO();

    @FXML
    public void guardar() {
        String cedula = txtCedula.getText();
        String nombre = txtNombre.getText();
        String telefono = txtTelefono.getText();
        String correo = txtCorreo.getText();

        if (cedula.isEmpty() || nombre.isEmpty()) {
            mostrarAlerta("Error", "Cédula y Nombre son obligatorios.", Alert.AlertType.ERROR);
            return;
        }

        Cliente cliente = new Cliente(cedula, nombre, telefono, correo);
        boolean resultado = clienteDAO.guardar(cliente);

        if (resultado) {
            mostrarAlerta("Éxito", "Cliente guardado correctamente.", Alert.AlertType.INFORMATION);
            limpiar();
        } else {
            mostrarAlerta("Error", "No se pudo guardar el cliente.", Alert.AlertType.ERROR);
        }
    }

    @FXML
    public void limpiar() {
        txtCedula.clear();
        txtNombre.clear();
        txtTelefono.clear();
        txtCorreo.clear();
    }

    private void mostrarAlerta(String titulo, String mensaje, Alert.AlertType tipo) {
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
