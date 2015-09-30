package revenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Banco {

    public static Connection Connect() {
        String url = "jdbc:postgresql://localhost:5432/revenda";
        String usuario = "admin123";
        String senha = "123";
        String driverName = "org.postgresql.Driver";

        Connection conn = null;
        try {
            Class.forName(driverName).newInstance();
            conn = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas ao tentar conectar com o banco de dados, contate o suporte");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao tentar conectar com o banco de dados, contate o suporte");
        }
        return conn;
    }

    public void insereDadosCliente(ClienteDados a) {

        PreparedStatement pst;
        String stm = "INSERT INTO revenda (nome, idade, peso_idade, investimento, peso_investimento, estado_conservacao, "
                + "peso_estado_conservacao, capacidade, peso_capacidade, autonomia, peso_autonomia, tamanho_bagageiro,"
                + "peso_tamanho_bagageiro, tipo_estrada, peso_tipo_estrada, tipo_veiculo, peso_tipo_veiculo, ano, peso_ano, "
                + "marca, peso_marca,\n"
                + "                modelo, peso_modelo, cambio, peso_cambio, direcao, peso_direcao, cor, peso_cor, numero_portas, peso_numero_portas,similaridade) "
                + "values(?, ?, ?, ?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?,?, ?, ?,?, ?, ?,?,?,?)";

        try {
            Connection conn = Banco.Connect();
            pst = conn.prepareStatement(stm);
            pst.setString(1, a.getNome());
            pst.setInt(2, a.getIdade());
            pst.setFloat(3, (float) 0.2);
            pst.setFloat(4, a.getInvestimento());
            pst.setFloat(5, (float) 1);
            pst.setString(6, a.getEstado_conservacao());
            pst.setFloat(7, (float) 0.6);
            pst.setInt(8, a.getCapacidade());
            pst.setFloat(9, (float) 0.7);
            pst.setFloat(10, a.getAutonomia());
            pst.setFloat(11, (float) 0.6);
            pst.setFloat(12, a.getTamanho_bagageiro());
            pst.setFloat(13, (float) 0.6);
            pst.setString(14, a.getTipo_estrada());
            pst.setFloat(15, (float) 0.8);
            pst.setString(16, a.getTipo_veiculo());
            pst.setFloat(17, (float) 0.8);
            pst.setInt(18, a.getAno());
            pst.setFloat(19, a.getPeso_ano());
            pst.setString(20, a.getMarca());
            pst.setFloat(21, a.getPeso_marca());
            pst.setString(22, a.getModelo());
            pst.setFloat(23, a.getPeso_modelo());
            pst.setString(24, a.getCambio());
            pst.setFloat(25, a.getPeso_cambio());
            pst.setString(26, a.getDirecao());
            pst.setFloat(27, a.getPeso_direcao());
            pst.setString(28, a.getCor());
            pst.setFloat(29, a.getPeso_cor());
            pst.setInt(30, a.getNum_portas());
            pst.setFloat(31, a.getPeso_porta());
            pst.setFloat(32, (float) 0.0);
            pst.execute();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao conectar ao banco, contate o suporte3a");
        }

    }

    public ResultSet retornaTabelaCompleta(ClienteDados a) {
        ResultSet rs = null;
        PreparedStatement pst;

        try {
            Connection conn = Banco.Connect();
            pst = conn.prepareStatement("SELECT * FROM REVENDA");
            rs = pst.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao conectar ao banco, contate o suporte");
        }

        return rs;
    }

    void insereSimilaridade(int idRetornado, double similaridadeTotal) {
        PreparedStatement pst;

        String stm = "update revenda set similaridade =" + similaridadeTotal + "where id = " + idRetornado + "";

        try {
            Connection conn = Banco.Connect();
            pst = conn.prepareStatement(stm);
            pst.execute();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas no insereSimilaridade");
        }
    }

    ResultSet pegaResultado() {
        ResultSet rs = null;
        PreparedStatement pst;

        try {
            Connection conn = Banco.Connect();
            pst = conn.prepareStatement("select f.modelo, f.cor, f.investimento, f.estado_conservacao, f.similaridade from revenda f order by f.similaridade desc limit 5;");
            rs = pst.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao conectar ao banco, contate o suporte");
        }

        return rs;
    }

}
