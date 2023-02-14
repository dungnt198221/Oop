package oopbaitaplon;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class FoodForm extends javax.swing.JFrame {

    private DefaultTableModel tblModel = null;
    private FoodList foodList = new FoodList();
    private DryFood dryFood = new DryFood();
    private FreshFood freshFood = new FreshFood();
    private boolean isEditMode = false;
    private int total ;

    /**
     * Creates new form FoodForm
     */
    public FoodForm() {
        initComponents();

        setLocationRelativeTo(null);

        initTable();

        initFoodData();

        btnFirstActionPerformed(null);
    }

//    in put food data
    private void initFoodData() {
        foodList.add(new Food("Gạo", "Khô","2021-05-12", "2022-01-10", 23, 2000000));
        foodList.add(new Food("Táo", "Tươi", "2022-01-01", "2022-05-02", 300, 2000000));
        foodList.add(new Food("Mận", "Tươi" ,"2022-01-01", "2022-05-02", 300, 2000000));
        foodList.add(new Food("Nho", "Khô","2022-01-12", "2022-05-08", 30, 2000000));
        foodList.add(new Food("Cafe", "Khô","2021-11-12", "2022-12-08", 50, 2000000));

        foodList.renderToTable(tblModel);
    }

    // input the names of the columns in the table
    public void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new Object[]{ "ID", "Tên", "LoaiTP", "Số lượng", "Thời gian nhập kho", "Hạn sử dụng", "Tổng chi phí"});

        tblFoods.setModel(tblModel);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtTimeFirst = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTimeLast = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        lblSatus = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblFoods = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        lblTotalCost = new javax.swing.JLabel();
        txtMonth = new javax.swing.JTextField();
        btnTotalMonth = new javax.swing.JButton();
        chkTuoi = new javax.swing.JRadioButton();
        chkKho = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Quản lí thực phẩm");

        jLabel2.setText("Thực phẩm tươi (kg)");

        jLabel3.setText("Thực phẩm khô (m^3)");

        jLabel4.setText("Số lượng");

        jLabel5.setText("Thời gian nhập kho");

        jLabel6.setText("Thời gian sử dụng");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSave)
                                        .addComponent(btnDelete)
                                        .addComponent(btnSearch)
                                        .addComponent(btnExit)
                                        .addComponent(btnNew))
                                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(11, Short.MAX_VALUE)
                                .addComponent(btnNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExit)
                                .addGap(36, 36, 36))
        );

        jLabel7.setText("Tên thực phẩm:");

        btnFirst.setText("||<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setText("<<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText(">||");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        lblSatus.setText("Record 1 of n");

        tblFoods.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFoodsMouseClicked(evt);
            }
        });

        jScrollPane4.setViewportView(tblFoods);

        jLabel9.setText("Tổng chi phí trong tháng:");

        btnTotalMonth.setText("=");
        btnTotalMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalMonthActionPerformed(evt);
            }
        });

        buttonGroup1.add(chkTuoi);
        chkTuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTuoiActionPerformed(evt);
            }
        });

        buttonGroup1.add(chkKho);
        chkKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkKhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 231, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtTimeFirst, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtName)
                                                        .addComponent(txtTimeLast, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnTotalMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lblTotalCost, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(21, 21, 21))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chkTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(chkKho, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(86, 86, 86))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(btnFirst)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrevious)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLast)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSatus, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(36, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane4)
                                        .addComponent(jSeparator2))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(chkKho)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2)
                                                .addComponent(chkTuoi)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtTimeFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5))
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(txtTimeLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel9)
                                                        .addComponent(lblTotalCost)
                                                        .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnTotalMonth)))
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnFirst)
                                        .addComponent(btnPrevious)
                                        .addComponent(btnNext)
                                        .addComponent(btnLast)
                                        .addComponent(lblSatus))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// button Next action performed get food ordinal next
    // show food on the screen
    // Dung's code
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {
        foodList.next();
        lblSatus.setText(foodList.getCurrentFoodInfo());
        Food food = foodList.getCurrentFood();
        fillFoodToForm(food);
        tblFoods.setRowSelectionInterval(foodList.getCurrentFoodIndex(), foodList.getCurrentFoodIndex());

    }

//button New action performed; Whitening form
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {
        txtName.setText("");
        txtQuantity.setText("");
        txtTimeFirst.setText("");
        txtTimeLast.setText("");
        txtMonth.setText("");
        lblTotalCost.setText("");

        isEditMode = false;
        foodList.renderToTable(tblModel);
    }
    
// button exit; exit form

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }


    private void chkTuoiActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void chkKhoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    //button Save action performed
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        boolean check = foodList.checkTimeLast();
        if (check) {
            JOptionPane.showMessageDialog(this, "Some expired foods have been removed!");
        }
        LocalDate startDate = LocalDate.parse(txtTimeFirst.getText());
        LocalDate endDate = LocalDate.parse(txtTimeLast.getText());
        if (startDate.isAfter(endDate)) {
            JOptionPane.showMessageDialog(this, "Date input error!");
        } else {
            if (LocalDate.now().isAfter(endDate)) {
                JOptionPane.showMessageDialog(this, "Expired food!");
            } else {
                try {
                    Food food = new Food();
                    food.setName(txtName.getText());
                    food.setQuantily(Float.parseFloat(txtQuantity.getText()));
                    food.setTimeFirst(txtTimeFirst.getText());
                    food.setTimeLast(txtTimeLast.getText());
                    if(chkKho.isSelected()) {
                        DryFood dryFood = new DryFood();
                        food.setTypeFood(dryFood.getDryFood());
                        total = dryFood.totalCost(startDate, endDate, food.getQuantily());
                    } else if(chkTuoi.isSelected()){
                        FreshFood freshFood = new FreshFood();
                        food.setTypeFood(freshFood.getFreshFood());
                        total = freshFood.totalCost(startDate, endDate, food.getQuantily());
                    }
                    food.setSeparateSum(total);

                    // Update Food;
                    if (isEditMode) {
                        if (foodList.searchByName(food.getName()) == null) {
                            JOptionPane.showConfirmDialog(this, "Food is not existed!");
                            return;
                        }else{
                            Food existedFood = foodList.searchByName(food.getName());
                            if (existedFood != null) {
                                existedFood.setQuantily(Float.parseFloat(txtQuantity.getText()));
                                existedFood.setTimeFirst(txtTimeFirst.getText());
                                existedFood.setTimeLast(txtTimeLast.getText());
                                if(chkKho.isSelected()) {
                                    DryFood dryFood = new DryFood();
                                    existedFood.setTypeFood(dryFood.getDryFood());
                                    total = dryFood.totalCost(startDate, endDate, food.getQuantily());
                                } else if(chkTuoi.isSelected()){
                                    FreshFood freshFood = new FreshFood();
                                    existedFood.setTypeFood(freshFood.getFreshFood());
                                    total = freshFood.totalCost(startDate, endDate, food.getQuantily());
                                }
                                existedFood.setSeparateSum(total);

                            }
                        }

                    } else {
                        if (foodList.searchByName(food.getName()) != null) {
                            JOptionPane.showConfirmDialog(this, "Food is existed! and can't insert new food");
                            return;
                        }
                        foodList.add(food);
                    }

                    foodList.renderToTable(tblModel );

                    JOptionPane.showMessageDialog(this, "Food saved!");

                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
                }
            }
        }

    }

    //button delete action performed
    //delete by name
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            boolean isok = foodList.deleteByName(txtName.getText());
            if (isok) {
                JOptionPane.showMessageDialog(this, "Food deleted!");
            } else {
                JOptionPane.showMessageDialog(this, "Food is not existed or delete fail!");
            }
            foodList.renderToTable(tblModel);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    //button search action performed
    //search by name, time to enter the warehouse, expired time
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            FoodList foodListS = new FoodList();
            Food foodname = foodList.searchByName(txtName.getText());
            ArrayList<Food> foodLoaiTPTuoi = foodList.searchByTypeFood("Tươi");
            ArrayList<Food> foodLoaiTPKho = foodList.searchByTypeFood("Khô");
            Food foodTimeFirst = foodList.searchByTimeFirst(txtTimeFirst.getText());
            Food foodTimeLast = foodList.searchByTimeLast(txtTimeLast.getText());
            if (foodname != null) {
                foodListS.add(foodname);

            } else if (foodTimeFirst != null) {

                foodListS.add(foodTimeFirst);

            } else if (foodTimeLast != null) {

                foodListS.add(foodTimeLast);

            } else if (chkTuoi.isSelected() ) {

                foodListS.addFoodList(foodLoaiTPTuoi);

            } else if (chkKho.isSelected()) {

                foodListS.addFoodList(foodLoaiTPKho);

            }
            foodListS.renderToTable(tblModel);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }


    // button totalMonth-Calculate the total cost of stocking food for a month.
    private void btnTotalMonthActionPerformed(java.awt.event.ActionEvent evt) {
        int a = foodList.totalMonth(txtMonth.getText() + "-01");
        lblTotalCost.setText(a + " VND");

    }

    // show food on the screen
    private void fillFoodToForm(Food foodname) {
        isEditMode = true;
        txtName.setText(foodname.getName());
        txtQuantity.setText("" + foodname.getQuantily());
        txtTimeFirst.setText(String.valueOf(foodname.getTimeFirst()));
        txtTimeLast.setText(String.valueOf(foodname.getTimeLast()));
    }


// get food ordinal first
    // show food on the screen
    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        foodList.first();
        lblSatus.setText(foodList.getCurrentFoodInfo());
        Food food = foodList.getCurrentFood();
        fillFoodToForm(food);
        tblFoods.setRowSelectionInterval(foodList.getCurrentFoodIndex(), foodList.getCurrentFoodIndex());
    }
    
// get food ordinal previous
    // show food on the screen
    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        foodList.previous();
        lblSatus.setText(foodList.getCurrentFoodInfo());
        Food food = foodList.getCurrentFood();
        fillFoodToForm(food);
        tblFoods.setRowSelectionInterval(foodList.getCurrentFoodIndex(), foodList.getCurrentFoodIndex());

    }//GEN-LAST:event_btnPreviousActionPerformed
    
// get food ordinal last
    // show food on the screen

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {
        foodList.last();
        lblSatus.setText(foodList.getCurrentFoodInfo());
        Food food = foodList.getCurrentFood();
        fillFoodToForm(food);
        tblFoods.setRowSelectionInterval(foodList.getCurrentFoodIndex(), foodList.getCurrentFoodIndex());

    }

    private void tblFoodsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFoodsMouseClicked
        int row = tblFoods.getSelectedRow();
        if (row >= 0) {
            String food1 = (String) tblFoods.getValueAt(row, 1);

            Food food = foodList.searchByName(food1);

            if (food != null) {
                fillFoodToForm(food);

                foodList.setCurrentFood(food);
                lblSatus.setText(foodList.getCurrentFoodInfo());
            }
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FoodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodForm().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton chkKho;
    private javax.swing.JRadioButton chkTuoi;
    private javax.swing.JButton btnTotalMonth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblSatus;
    private javax.swing.JLabel lblTotalCost;
    private javax.swing.JTable tblFoods;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTimeFirst;
    private javax.swing.JTextField txtTimeLast;
    private javax.swing.JTextField txtMonth;

    // End of variables declaration//GEN-END:variables
}
