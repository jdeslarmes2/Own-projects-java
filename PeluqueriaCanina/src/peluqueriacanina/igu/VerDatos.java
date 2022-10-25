package peluqueriacanina.igu;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import peluqueriacanina.logica.Controladora;
import peluqueriacanina.logica.Mascota;

public class VerDatos extends javax.swing.JFrame {

    //Buena práctica siempre inicializar la controladora aunque sea en NULL, no ocupa espacio en memoria
    Controladora control =null;
    
    public VerDatos() {
        control = new Controladora();
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setText("Visualización de Datos");

        tablaMascotas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Datos de mascotas");

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\jdeslarmes\\Documents\\Personal\\Egg\\Javi\\Peluquería canina\\Eliminar1.jpg")); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\jdeslarmes\\Documents\\Personal\\Egg\\Javi\\Peluquería canina\\Editar1.jpg")); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(333, 333, 333))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
        //Controlo que la tabla no este vacía
        if (tablaMascotas.getRowCount() > 0){
            //Controlo que se haya seleccionado a una mascota
            if (tablaMascotas.getSelectedRow()!=-1) {  
                //Obtengo Id de mascota a eliminar
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));// con el valueOf convierto a String?
                
                //Llamo al método borrar
                control.borrarMascota(num_cliente);
                
                //aviso al usuario que borro correctamente
                mostrarMensaje("Mascota eliminada correctamente", "Info", "Borrado de mascota");
                cargarTabla();          //Para que desaparezca de la tabla hay que actualizar los datos de la tabla (error común)
            }
            else {
                mostrarMensaje("No selecccionó ninguna mascota", "Error", "Error al eliminar");
            }
        }
        else {
            mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        //Controlo que la tabla no este vacía
        if (tablaMascotas.getRowCount() > 0){
            //Controlo que se haya seleccionado a una mascota
            if (tablaMascotas.getSelectedRow()!=-1) {  
                
                //Obtengo Id de mascota a editar
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));// con el valueOf convierto a String?
                
                ModificarDatos pantallaModif = new ModificarDatos(num_cliente);
                pantallaModif.setVisible(true);
                pantallaModif.setLocationRelativeTo(null);
                
                this.dispose(); //Se cierra ventana al terminar de Editar
            }

        else {
                mostrarMensaje("No selecccionó ninguna mascota", "Error", "Error al eliminar");
            }
        }
        else {
            mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
        }
        
        
    }//GEN-LAST:event_btnEditarActionPerformed
    
    public void mostrarMensaje (String mensaje, String tipo, String titulo){
        
                JOptionPane optionPane = new JOptionPane(mensaje);
                if (tipo.equals("Info")){
                    optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                }
                else if (tipo.equals("Error")){
                    optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);  //Siempre hay que asegurarse que termina en MESSAGE cuando quiero mandar mensaje
                }
                JDialog dialog = optionPane.createDialog(titulo);
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
                
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {
        // Definir el MODELO que queremos de tabla
        //Consejo: Usar siempre nombres identificativos para luego no confundirse, ej. si uso tabla solo pudo pensar que hace la tabla y esto es solo un modélo.
        DefaultTableModel modeloTabla = new DefaultTableModel(){
        //Con lo siguiente no permitis que los campos de la tabla al tocarlos en la interface gráficas los edites
        //Consejo: SIEMPRE QUE USAS UN METODO COMO ISCELLEDITABLE, propio de las tablas, usar el el OVERRIDE  (estas sobreescribiendo un método propio de la interface que estás utilizando para la tabla o modelo de la tabla estas    
            @Override
            public boolean isCellEditable (int row, int column){
                return false;
            }
        };
        //Establecer los nombres de las columnas
        String titulos[] = {"Num", "Nombre","Color", "Raza", "Alergico", "At. Esp.", "Dueño", "Cel"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //carga de los datos desde la BD
        List <Mascota> listaMascotas = control.traerMascotas();
        
        //Recorrer la lista y mostarar cada uno de los elementos en la tabla
        if (listaMascotas!=null){
            for (Mascota masco : listaMascotas) {
                Object[] objeto = {masco.getNum_cliente(), masco.getNombre(), masco.getColor(), masco.getRaza(), masco.getAlergico(), masco.getAtencion_especial(),
                    masco.getUnduenio().getNombre(), masco.getUnduenio().getCelDuenio()};
                
                modeloTabla.addRow(objeto);
            }
        }
        //El nombre tablaMascotas lo defini cambiando el nombre de la variable de Tabla en el diseño, ahí hay que asignarle el modelo (con nombre tabla)
        tablaMascotas.setModel(modeloTabla);
    }
}
