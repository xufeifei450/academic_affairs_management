<template>
    <div>
        <div class="table">
            <el-table :data="tableData" stripe border
                      :cell-class-name="tableCellClassName"
                      :cell-style=" { textAlign: 'center' ,padding:'0px',fontSize:'12px'}"
                      :header-cell-style=" { 'text-align': 'center' }"
                      :row-style="{height:'80px'}">
                <el-table-column prop="segment" label="时间" width="180" height="200" ></el-table-column>
                <el-table-column prop="monday" label="星期一" show-overflow-tooltip ></el-table-column>
                <el-table-column prop="tuesday" label="星期二" show-overflow-tooltip></el-table-column>
                <el-table-column prop="wednesday" label="星期三" show-overflow-tooltip></el-table-column>
                <el-table-column prop="thursday" label="星期四" show-overflow-tooltip></el-table-column>
                <el-table-column prop="friday" label="星期五" show-overflow-tooltip></el-table-column>
                <el-table-column prop="saturday" label="星期六" show-overflow-tooltip></el-table-column>
                <el-table-column prop="sunday" label="星期日" show-overflow-tooltip></el-table-column>

            </el-table>


        </div>

    </div>
</template>

<script>
    export default {
        name: "Curriculum",
        data() {
            return {
                tableData: [],
                user: JSON.parse(localStorage.getItem('xm-user') || '{}'),
            }
        },
        created() {
            this.load()
        },
        methods: {
            load() {
                this.$request.get('/choice/getCurriculum').then(res => {
                    if (res.code === '200') {
                        this.tableData = res.data
                    } else {
                        this.$message.error(res.msg)
                    }
                })
            },
            //用来修改单元格css
            tableCellClassName({ row, column, rowIndex, columnIndex }) {
                if (columnIndex == 0) {
                    return 'cell-start'
                } else if (columnIndex == 9) {
                    return 'cell-end'
                } else {
                    return 'cell-middle'
                }
            }
        }
    }
</script>
<style>
    .cell-start {
        border-top: 1px solid #ebeff0;
        border-bottom: 1px solid #ebeff0 !important;
        border-left: 1px solid #ebeff0;
    }
    .cell-end {
        border-top: 1px solid #ebeff0;
        border-bottom: 1px solid #ebeff0 !important;
        border-right: 1px solid #ebeff0;
    }
    .cell-middle {
        border-top: 1px solid #ebeff0;
        border-bottom: 1px solid #ebeff0 !important;
    }

    .el-table__body tr:hover > .cell-middle {
        border-top: 1px solid #18AFE5;
        border-bottom: 1px solid #18AFE5 !important;
    }
    .el-table__body tr:hover > .cell-start {
        border-top: 1px solid #18AFE5;
        border-bottom: 1px solid #18AFE5 !important;
        border-left: 1px solid #18AFE5;
    }
    .el-table__body tr:hover > .cell-end {
        border-top: 1px solid #18AFE5;
        border-bottom: 1px solid #18AFE5 !important;
        border-right: 1px solid #18AFE5;
    }

    </style>

