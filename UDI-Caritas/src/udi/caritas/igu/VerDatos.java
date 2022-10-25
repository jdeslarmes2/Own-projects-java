
package udi.caritas.igu;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import udi.caritas.logica.Alumno;
import udi.caritas.logica.Controladora;


public class VerDatos extends javax.swing.JFrame {

    Controladora control = null;
    
    public VerDatos() {
        control = new Controladora();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setText("Visualización de Datos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(348, 348, 348))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(26, 26, 26))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaAlumnos);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Datos de Alumnos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\jdeslarmes\\Documents\\Personal\\Egg\\Javi\\Peluquería canina\\Eliminar1.jpg")); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\jdeslarmes\\Documents\\Personal\\Egg\\Javi\\Peluquería canina\\Editar1.jpg")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //Controlo que la tabla no este vacía
        if(tablaAlumnos.getRowCount()>0){
            //Controlo que se haya seleccionado a un alumno
            if(tablaAlumnos.getSelectedRow()!=-1){ //El -1 significa que no selecciono ninguna fila, por que arranca en 0 con la selección
                //Saco el atributo numero del alumno (ID) de la fila seleccionada para borrar
                int num_alumno = Integer.parseInt(String.valueOf(tablaAlumnos.getValueAt(tablaAlumnos.getSelectedRow(), 0))); //Con value of convierto a String y con el parseo convierto a integer
                //Llamo al método borrar
                control.borrarAlumno(num_alumno);
                //Aviso al usuario que borro correctamente
                mostrarMensaje("Alumno eliminado correctamente", "Info", "Borrado de alumno");
                cargarTabla(); //VOLVER A ACTUALIZAR TABLA PARA NO VERLO EN LA TABLA, NO HACERLO ES UN ERROR COMUN
                
                
            }
            else {
                mostrarMensaje("No seleccionó ningún alumno", "Error", "Error al eliminar"); 
            }   
        }
        else{
            mostrarMensaje("No hay nada que eliminar en la tabla", "Error", "Error al eliminar");
        }
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         //Controlo que la tabla no este vacía
        if(tablaAlumnos.getRowCount()>0){
            //Controlo que se haya seleccionado a un alumno
            if(tablaAlumnos.getSelectedRow()!=-1){ //El -1 significa que no selecciono ninguna fila, por que arranca en 0 con la selección
              //Saco el atributo numero del alumno (ID) de la fila seleccionada para editar  
             int num_alumno = Integer.parseInt(String.valueOf(tablaAlumnos.getValueAt(tablaAlumnos.getSelectedRow(), 0)));   
             
             ModificarDatos pantallaModif = new ModificarDatos(num_alumno);
             pantallaModif.setVisible(true);
             pantallaModif.setLocationRelativeTo(null);
            }
            else {
                mostrarMensaje("No seleccionó ningún alumno", "Error", "Error al eliminar"); 
            }   
            }
            else{
            mostrarMensaje("No hay nada que eliminar en la tabla", "Error", "Error al eliminar");
            }      
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public void mostrarMensaje(String mensaje, String tipo, String titulo){
               //Ventana que abre con aviso de guardado cuando termina de guardar en BD
               JOptionPane optionPane = new JOptionPane(mensaje);
               if(tipo.equals("Info")){
                   optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
               }
               else if (tipo.equals("Error")){
                  optionPane.setMessageType(JOptionPane.ERROR_MESSAGE); 
               }
               JDialog dialog = optionPane.createDialog(titulo);
               dialog.setAlwaysOnTop(true);
               dialog.setVisible(true); 
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAlumnos;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        //Definir el modelo de tabla
        DefaultTableModel tablaModelo = new DefaultTableModel(){
            //Que filas y columnas no sean editables
            @Override
            public boolean isCellEditable (int row, int column) {
            return false;
            }
        };
        
        //Establecemos los nombres de las columnas
        String titulos [] = {"Num", "Nombre", "Fecha Nac.", "DNI", "Docente", "Turno", "Escuela", "Grado", "Tel. Esc", "Familiar", "DNI Fam", "Tel. Fam", "Otros datos" };
        tablaModelo.setColumnIdentifiers(titulos);
        
        //Carga de los datos desde la BD
        List <Alumno> listaAlumnos = control.traerAlumnos();
        
        //Recorrer la lista y mostrar cada uno de los elementos de la tabla
        
        if(listaAlumnos!=null){
            for (Alumno alum : listaAlumnos){
                Object[] objeto = {alum.getNumAlumno(), alum.getNombreAlumno(), alum.getFechaNacimiento(),alum.getDni(), 
                    alum.getDocente(), alum.getTurno(), alum.getUnaEscuela().getEscuela(), alum.getUnaEscuela().getGrado(), alum.getUnaEscuela().getTelefonoEscuela(),
                    alum.getUnaFamilia().getNombreFamiliar(), alum.getUnaFamilia().getDniFamiliar(),alum.getUnaFamilia().getTelefonoFamiliar() ,alum.getUnaFamilia().getOtrosDatos()};
                
                tablaModelo.addRow(objeto);
              }
            }
        tablaAlumnos.setModel(tablaModelo);//Asigno el modelo de tabla a la vista del diseño de la tabla en la interface gráfica que llame tablaAlumnos
        }
        
    }

